# 在IDEA中切换JDK

有时候，我们需要在工作中使用不同的JDK版本，因此，学会切换不同的JDK版本十分重要。

当你需要为项目切换不同版本的JDK时，请打开`File` - `Project Structure`，选择你需要的JDK版本，然后按`OK`，如图所示：

![idea-project-structure](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-project-structure.png)

如你需要的JDK版本不在列表中，你可以点`Edit`，选择你下载安装的其他JDK版本，如图所示。

![idea-add-jdk](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-add-jdk.png)

请牢记，无论何时，只要进行了项目结构相关的变更（如添加/删除依赖、切换JDK、切换分支等），
就需要点击右上角的Maven菜单里的刷新按钮，重新导入项目，如图所示。

![switch-aliyun-maven-profile](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/zh/switch-aliyun-maven-profile.png)

你以后会无数次使用这个操作，请务必牢记在心，非常重要！
