# 在VSCode中Clone、导入然后运行Maven项目

因为你已经通过了之前的`git version`挑战，`git`应该已经正确安装，所以在你的终端（如`Terminal`/`git-bash`/`cmd`等）输入：

`git clone https://github.com/ByteLegendQuest/java-clone-switch-branch`

如果碰到问题（超时，SSL异常或者下载缓慢），请尝试国内镜像：

`git clone https://git.bytelegend.com/ByteLegendQuest/java-clone-switch-branch`

这会在本地创建一个名为`java-clone-switch-branch`的项目文件夹，你可以把它移动到你喜欢的任何地方去。

打开`VSCode`，选择`File` - `Open`， 选择你刚才Clone下来的项目文件夹。请确保已经安装了
[Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)。

![install-extension-pack-for-java.png](../install-extension-pack-for-java.png)

如果你之前没有在VSCode中配置过JDK，则点击侧边栏中的齿轮，选择`Settings`，搜索`Runtime`，选择`Extensions` - `Java` - `Configuration: Runtimes`配置，点击`Edit in settings.json`。

![edit-settings-json.png](../edit-settings-json.png)

按照如下格式进行 JDK 的配置：

```json
{
  ...在原有的配置后面添加以下配置，注意可能要添加一个逗号
  "java.configuration.runtimes": [
    {
      "name": "JavaSE-17", // JDK 名称
      "path": "~/.sdkman/candidates/java/17.0.2-tem", // JDK 路径
      "default": true // 是否为默认值
    }
  ]
}
```

注意下图中的位置①可能需要添加一个英文逗号，否则可能报JSON格式错误。

![vscode-jdk-conf](../vscode-jdk-conf.png)

如果你没有魔法，项目的导入可能会很慢，这是因为默认的Maven中央仓库在中国大陆没有CDN节点。
在你了解Maven原理之前，**请勿**贸然按照网上教程胡乱修改本地的Maven配置。
我们在项目中内置了阿里云镜像，一键开启，只对该项目生效，没有毒副作用。

打开本项目中的`.vscode/settings.json`文件，将`maven.executable.options`这行前面的注释（`//`）去掉，
关闭VSCode重新打开项目即可。

![vscode-aliyun](./vscode-aliyun.png)

请稍等片刻，待项目导入完成后，打开`src/main/java/com/bytelegend/Main.java`文件，你会在右上角看到一个三角按钮。
点击之，程序将会运行并将答案打印在下方的标准输出中，如图所示。

![idea-run-main](../vscode-run-main.png)

这串字符就是这个挑战的答案，请不要骄傲，再接再厉！
