# 在IDEA中切换`git`分支

你可以将`git`的代码分支看作存在于同一个代码仓库中的互不干扰的副本。
这是因为很多情况下，我们需要多个版本的代码同时存在，例如：

- 多人协作开发时每个人的进度，甚至同一个人手上不同工作的进度不同：如你正在开发新功能，突然用户报告了一个严重bug，
  你必须先放下手头的工作把bug解决掉。
- 需要维护同一个软件的多个不同版本：如有的客户在使用`1.x`版本，有的在使用`2.x`版本，当出现严重bug时，必须同时
  将补丁同步到所有维护的版本（`1.1`/`1.2`/`2.0`/`3.0`/...）上。

你可以使用以下的**任意一种方法**切换代码分支：

## IDEA图形界面

点击IDEA右下角的分支图标，它显示我们当前位于默认的`main`分支上。选择`origin/jdk17` - `Checkout`，如图所示。

![switch-branch-in-idea-gui](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/switch-branch-in-idea-gui.png)

IDEA会弹出提示`Checked out new branch jdk17 from origin/jdk17`，证明分支切换成功，如图所示：

![switch-branch-in-idea-gui-success](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/switch-branch-in-idea-gui-success.png)

## IDEA中的命令行（终端/Terminal/`git-bash`/`cmd`）

点击下方的`Terminal`标签页，输入`git checkout jdk17`，如果显示`Branch 'jdk17' set up to track remote branch 'jdk17' from 'origin'`则证明分支切换成功，如图所示：

![switch-branch-in-idea-terminal](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/switch-branch-in-idea-terminal.png)

# 切换分支之后的操作

在切换分支之后，你可能会发现代码变红了（如上图中），请牢记，无论何时，只要进行了项目结构相关的变更（如添加/删除依赖、切换JDK、切换分支等），
就需要点击右上角的Maven菜单里的刷新按钮，重新导入项目，如图所示。

![switch-aliyun-maven-profile](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/zh/switch-aliyun-maven-profile.png)

你以后会无数次使用这个操作，请务必牢记在心，非常重要！
