# Switch2Cursor

> 推荐在 Cursor 中配合 [Switch2IDEA](https://github.com/qczone/switch2idea) 使用，效果更佳

Switch2Cursor 是一个 JetBrains IDE 插件，可以让你在 IDE 和 Cursor 

![Switch2Cursor演示](images/switch-show.gif)

## 主要特性

- 🚀 无缝切换编辑器
  - 在 JetBrains IDE 和 Cursor 之间一键切换
  - 自动定位到相同的光标位置（行号和列号）
  - 完美保持编辑上下文，不中断思路

- ⌨️ 便捷的快捷键
  - `Alt+Shift+O` - 在 Cursor 中打开当前文件
  - `Alt+Shift+P` - 在 Cursor 中打开整个项目

- 🔧 多种访问方式
  - 快捷键操作
  - 编辑器右键菜单
  - IDE 工具菜单

## 安装方法

1. 在 [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/26309-switch2cursor) 下载插件
2. 或者在 IDE 中 搜索 "switch2cursor" 安装

## 使用方法

### 打开当前文件

- 按下 `Alt+Shift+O`
- 在编辑器中右键 → Open File In Cursor
- 工具菜单 → Open File In Cursor

### 打开项目

- 按下 `Alt+Shift+P`
- 在项目视图中右键 → Open Project In Cursor
- 工具菜单 → Open Project In Cursor

## 配置说明

1. 进入 Settings/Preferences → Tools → Switch2Cursor
2. 设置 Cursor 可执行文件路径（默认为 "cursor"）
3. 通过 Keymap 设置自定义快捷键

## 系统要求

- 已安装 Cursor (https://cursor.sh)
- 兼容所有 JetBrains IDE
- 支持的 IDE 版本：2024.1 及以上

## 从源码构建

1. 克隆仓库：

```bash
git clone https://github.com/qczone/switch2cursor.git
```

2. 使用 Gradle 构建：

```bash
./gradlew buildPlugin
```

3. 插件将生成在 `build/distributions/` 目录下

## 贡献代码

欢迎提交 Pull Request！

## 开源协议

本项目采用 MIT 协议 - 详见 [LICENSE](LICENSE) 文件。

## 支持

如果遇到问题或有建议，请在 GitHub 上[创建 issue](https://github.com/qczone/switch2cursor/issues)。