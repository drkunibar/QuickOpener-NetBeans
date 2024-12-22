package com.sessonad.oscommands.detector;

/**
 * @author SessonaD
 */
public class OSDetector {

    public static OperatingSystem detectOS() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            return OperatingSystem.WINDOWS;
        } else if (osName.contains("mac os")) {
            return OperatingSystem.MAC_OS;
        } else if (osName.contains("linux")) {
            return detectLinuxGUI();
        } else {
            return OperatingSystem.UNKNOWN;
        }
    }

    private static OperatingSystem detectLinuxGUI() {
        try {
            if (checkProcessNames("gnome-session", "gnome-session-binary")) {
                return OperatingSystem.LINUX_GNOME;
            } else if (checkProcessNames("ksmserver", "kdeinit4")) {
                return OperatingSystem.LINUX_KDE;
            } else if (checkProcessNames("xfce4-session", "xfce-mcs-manage")) {
                return OperatingSystem.LINUX_XFCE;
            } else if (checkProcessNames("lxsession")) {
                return OperatingSystem.LINUX_LXDE;
            } else if (checkProcessNames("cinnamon-session", "cinnamon-session-binary")) {
                return OperatingSystem.LINUX_CINNAMON;
            } else {
                return detectLinuxGUIByXDG();
            }
        } catch (Exception e) {
            return OperatingSystem.LINUX_UNKNOWN;
        }
    }

    private static OperatingSystem detectLinuxGUIByXDG() {
        String xdgSessionDesktop = System.getenv("XDG_SESSION_DESKTOP");
        return switch (xdgSessionDesktop) {
            case "cinnamon" -> OperatingSystem.LINUX_CINNAMON;
            case "Unity", "FNOME", "ubuntu:GNOME" -> OperatingSystem.LINUX_GNOME;
            case "XFCE" -> OperatingSystem.LINUX_XFCE;
            case "KDE" -> OperatingSystem.LINUX_KDE;
            case "LXDE" -> OperatingSystem.LINUX_LXDE;
            default -> OperatingSystem.LINUX_UNKNOWN;
        };
    }

    private static boolean checkProcessNames(String... processNames) throws Exception {
        for (String processName : processNames) {
            if (executePidOfCommand(processName)) {
                return true;
            }
        }
        return false;
    }

    private static boolean executePidOfCommand(String processName) throws Exception {
        Process process = Runtime.getRuntime().exec(new String[] { "pidof", processName });
        return process.waitFor() == 0;
    }

}
