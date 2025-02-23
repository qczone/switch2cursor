# Switch2Cursor

[中文文档](README_zh.md)

> 💡 Recommended to use with [Switch2IDEA](https://github.com/qczone/switch2idea) in Cursor


[![JetBrains Plugins](https://img.shields.io/jetbrains/plugin/v/26309-switch2cursor?label=JetBrains%20Marketplace&style=for-the-badge&logo=intellij-idea)](https://plugins.jetbrains.com/plugin/26309-switch2cursor)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/26309-switch2cursor?style=for-the-badge&logo=intellij-idea)](https://plugins.jetbrains.com/plugin/26309-switch2cursor)
[![License](https://img.shields.io/badge/license-MIT-blue.svg?style=for-the-badge)](LICENSE)

## 🔍 Introduction
A JetBrains IDE plugin that enhances development efficiency by enabling seamless switching between JetBrains IDE and Cursor

![Switch2Cursor Demo](images/switch-show.gif)

## 🌟 Features

- 🚀 Seamless Editor Switching
  - One-click switch between JetBrains IDE and Cursor
  - Automatically positions to the same cursor location (line and column)
  - Perfectly maintains editing context without interrupting workflow

- ⌨️ Convenient Shortcut Support
  - macOS:
    - `Option+Shift+P` - Open project in Cursor
    - `Option+Shift+O` - Open current file in Cursor
  - Windows:
    - `Alt+Shift+P` - Open project in Cursor
    - `Alt+Shift+O` - Open current file in Cursor

- 🔧 Multiple Access Methods
  - Keyboard shortcuts
  - Editor context menu
  - IDE tools menu

## 🛠️ Installation Guide

### Method 1: Install via JetBrains Marketplace
1. Open IDE → `Settings` → `Plugins` → `Marketplace`
2. Search for switch2cursor
3. Click `Install` to complete installation
4. Click `OK` to apply changes

### Method 2: Local Installation
1. Download the latest plugin package from [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/26309-switch2cursor)
2. IDE → `Settings` → `Plugins` → `⚙️`→ `Install Plugin from Disk...`
3. Select the downloaded plugin package
4. Click `OK` to apply changes


## 🚀 Usage Guide

### Basic Usage

#### Open Project
- Shortcuts:
  - macOS: `Option+Shift+P` 
  - Windows: `Alt+Shift+P`
- Context Menu: Right-click in project view → `Open Project In Cursor`
- Tools Menu: `Tools` → `Open Project In Cursor`

#### Open Current File
- Shortcuts:
  - macOS: `Option+Shift+O` 
  - Windows: `Alt+Shift+O`
- Context Menu: Right-click in editor → `Open File In Cursor`
- Tools Menu: `Tools` → `Open File In Cursor`

### Configuration
- In `Settings/Preferences` → `Tools` → `Switch2Cursor`:
  - Set Cursor executable path (default is "cursor")
  - Customize shortcuts through Keymap settings

### Requirements
- [Cursor](https://cursor.com) installed
- Compatible with all JetBrains IDEs (version 2022.3 and above)

## 🧑‍💻 Developer Guide

### Build Project
```bash
# Clone repository
git clone https://github.com/qczone/switch2cursor.git

# Build plugin
cd switch2cursor
./gradlew buildPlugin  
# Plugin package will be generated in build/distributions/ directory
```

### Contributing
1. Fork this repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Submit a Pull Request

## 🙋 FAQ 

### 1. Why doesn't the shortcut/menu click switch to Cursor after installation?
Check if the correct Cursor executable path is configured in `Settings` → `Tools` → `Switch2Cursor`

### 2. Which IDEs are supported?
Supports all JetBrains IDEs, including: IntelliJ IDEA, PyCharm, WebStorm, GoLand, RustRover, Android Studio, etc.

### 3. Which versions are supported?
The plugin is developed based on JDK 17 and currently only supports JetBrains IDE version 2022.3 and above

### 4. How to modify plugin shortcuts?
Modify in `Settings` → `Keymap` → `Plugins` → `Switch2Cursor`

## 📄 License
This project is licensed under the [MIT License](LICENSE)


## 📮 Feedback
If you encounter any issues or have suggestions, please provide feedback through:
- [Submit GitHub Issue](https://github.com/qczone/switch2cursor/issues) 

## 🌟 Star History

[![Star History Chart](https://api.star-history.com/svg?repos=qczone/switch2cursor&type=Date)](https://star-history.com/#qczone/switch2cursor&Date)