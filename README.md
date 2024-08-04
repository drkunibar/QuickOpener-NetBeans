___

## This is a fork of <https://github.com/dzsessona/QuickOpener-NetBeans> so we can publish it to the [Netbeans Plugin Portal](https://plugins.netbeans.apache.org/).
___

Sometimes while programming in NetBeans you want to explore a particular file that you are editing on the file system browser, or maybe launch a command in a terminal to do something with it.

![Plugin toolbar](https://raw.githubusercontent.com/drkunibar/QuickOpener-NetBeans/master/qoscreenshots/shot2.png)

This plugins brings to your NetBeans six action, three of them always available and three of them available when the selected node has a file assiociated with it. In particular:

_When the selection has a valid file:_

* **Open the default OS shell** on the location of the file (or its folder) selected.
![icon](https://raw.githubusercontent.com/drkunibar/QuickOpener-NetBeans/master/qoscreenshots/shot7.PNG)&nbsp;
* **Open the file system browser** on the location of the file (or its folder) selected.
![icon](https://raw.githubusercontent.com/drkunibar/QuickOpener-NetBeans/master/qoscreenshots/shot8.png)&nbsp;
* **Copy to the clipboard** the path of the file selected.
![icon](https://raw.githubusercontent.com/drkunibar/QuickOpener-NetBeans/master/qoscreenshots/shot9.PNG)&nbsp;

_Always enabled:_

* **Launch a shell command** (with parameters, customizable on preferences) ![icon](https://raw.githubusercontent.com/drkunibar/QuickOpener-NetBeans/master/qoscreenshots/launch.png)&nbsp;
* **FileSystem browser on any location** (favorites, customizable on preferences)
![icon](https://raw.githubusercontent.com/drkunibar/QuickOpener-NetBeans/master/qoscreenshots/shot10.png)
* **Open a shell on any location** (favorites, customizable on preferences)
![icon](https://raw.githubusercontent.com/drkunibar/QuickOpener-NetBeans/master/qoscreenshots/shot11.png)

## Updates

### 1.3.1

* [NONE]: Use Java 17
* [NONE]: Restruncture Build (Parent-POM, Signed Module)

### 1.3.0
* \[[Task 94](https://github.com/dzsessona/QuickOpener-NetBeans/issues/94)\]: Publish to new plugins
 central
* [NONE]: New `groupId` and `artifactId`

### 1.2.0:

* \[[Feature 86](https://github.com/dzsessona/QuickOpener-NetBeans/pull/86)\]: Support Mate-terminal and Caja-/Space-file manager via configurator (Ubuntu Mate) (PR by javatlacati)
* \[[Task 84](https://github.com/dzsessona/QuickOpener-NetBeans/pull/84)\]: Fix line-endings and update to JDK7 (PR by javatlacati)


### 1.1.0:
* [[Feature 66](https://github.com/dzsessona/QuickOpener-NetBeans/issues/66)]: Refactor run custom dialog: simplify, add keyboard-only support
* [[Feature 33](https://github.com/dzsessona/QuickOpener-NetBeans/issues/33)]: Support for project folder replacement variable ${projectFolder}/${mainProjectFolder}
* [[Feature 67](https://github.com/dzsessona/QuickOpener-NetBeans/issues/67)]: More patterns - see <a href="https://github.com/dzsessona/QuickOpener-NetBeans/issues/67">details</a>
* [[Feature 30](https://github.com/dzsessona/QuickOpener-NetBeans/issues/30)]: Support favorites nodes
* [[Feature 64](https://github.com/dzsessona/QuickOpener-NetBeans/issues/64)]: Support lookups with java.io.File
* [[Bugfix 65](https://github.com/dzsessona/QuickOpener-NetBeans/issues/65)]: Missing mnemonics in dialogs and options
* [[Bugfix 69](https://github.com/dzsessona/QuickOpener-NetBeans/issues/69)]: "Launch custom command..." should be available if there is no selected file
* [[Bugfix 77](https://github.com/dzsessona/QuickOpener-NetBeans/issues/77)]: Fix GUI detection for Ubuntu 16.04

### 1.0.4:
* [[Bugfix 63](https://github.com/dzsessona/QuickOpener-NetBeans/issues/63)]: File manager opens twice (KDE)
* [[Bugfix 62](https://github.com/dzsessona/QuickOpener-NetBeans/issues/62)]: java.lang.NoSuchMethodError: java.lang.Process.waitFor running NB @ JDK7
 
### 1.0.3:
* [[Task 56](https://github.com/dzsessona/QuickOpener-NetBeans/issues/56)]: Provide a 8.1 version for the plugin center
* [[Task 60](https://github.com/dzsessona/QuickOpener-NetBeans/issues/60)]: Include new version of oscommands
* [[Task 61](https://github.com/dzsessona/QuickOpener-NetBeans/issues/61)]: Convert to maven-project for better maintainence
* [[Bugfix 51](https://github.com/dzsessona/QuickOpener-NetBeans/issues/51)]: [Windows] Open in FileManager should select the file/dir
* [[Bugfix 49](https://github.com/dzsessona/QuickOpener-NetBeans/issues/49)]: [Linux] Crash in options when running "LinuxUnknown" and KDE not detected
 