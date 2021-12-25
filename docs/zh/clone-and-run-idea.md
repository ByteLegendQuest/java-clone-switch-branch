# 在IntelliJ IDEA中Clone、导入然后运行Maven项目

因为你已经通过了之前的`git version`挑战，`git`应该已经正确安装，所以在你的终端（如`Terminal`/`git-bash`/`cmd`等）输入：

`git clone https://github.com/ByteLegendQuest/java-clone-switch-branch`

如果碰到问题（超时，SSL异常或者下载缓慢），请尝试国内镜像：

`git clone https://git.bytelegend.com/ByteLegendQuest/java-clone-switch-branch`

这会在本地创建一个名为`java-clone-switch-branch`的项目文件夹，你可以把它移动到你喜欢的任何地方去。

打开`IDEA`，选择`File` - `Open`，选中刚刚创建`java-clone-switch-branch`的项目文件夹下的`pom.xml`并打开。
因为`pom.xml`是Maven项目的入口，IDEA会提示是否打开项目，点击`Open as Project`，如图所示。

![idea-open-project](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-open-project.png)

如果你的IDEA第一次打开Java项目，它可能会报错没有配置JDK(`Project JDK is not defined`)。请打开`File` - `Project Structure`，如果显示"No JDK"，点击`Edit`按钮，
将之前下载的JDK添加到IDEA中。

![idea-project-structure](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-project-structure.png)

![idea-add-jdk](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-add-jdk.png)

如果你没有魔法，项目的导入可能会很慢，这是因为默认的Maven中央仓库在中国大陆没有CDN节点。
在你了解Maven原理之前，**请勿**贸然按照网上教程胡乱修改本地的Maven配置。
我们在项目中内置了阿里云镜像，一键开启，只对该项目生效，没有毒副作用。
如图所示，在IDEA的右上角的`Maven`工具栏中，选中`aliyun-maven`然后**按刷新按钮刷新项目结构**。

![switch-aliyun-maven-profile](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/zh/switch-aliyun-maven-profile.png)

请稍等片刻，待项目导入完成后，打开`src/main/java/com/bytelegend/Main.java`文件，你会看到两个绿色三角按钮。
点击其中任意一个，选择`Run Main.main()`，程序将会运行并将答案打印在下方的标准输出中，如图所示。

![idea-run-main](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-run-main.png)

这串字符就是这个挑战的答案，请不要骄傲，再接再厉！
