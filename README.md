# blog 一个基于SpringBoot技术栈的个人博客--->前端  
blog前端项目主要编写controller和页面静态化(使用Thymeleaf模板引擎),直接调用服务端发布的服务,完成数据交互。
# 2017/8/14 星期一 下午 11:36:47   
前端的初始导入:(TODO 前端静态页面)
# 2017/8/25 星期五 下午 2:36:38
### 完成blog首页、内容页、后台首页的编写，发表文章,查看文章等功能 ###
#### Thymeleaf模板引擎的使用 ####
- html标签添加thymeleaf的约束  
![](http://i.imgur.com/OcCn67p.png)
- 默认spring boot读取thymeleaf文件的路径是`src/main/resource/templates`，静态文件是`src/main/resource/static`
- 表达式的使用  
 1. URL表达式: @{...}  
 ![](http://i.imgur.com/A5k6N21.png)  
 默认路径为static目录下,注意/css,"/"不能少,要写成**绝对路径**  
 2. 变量表达式: ${...}  
 ![](http://i.imgur.com/bX33nkh.png)  
 和EL表达式用法一样,可以从四个作用域中取值。`th:each`循环遍历属性,blog为循环体的别名  
 3. 选择表达式： *{...}(后面补充)  
 4. 消息表达式: #{...}  
 只要用于国际化i18n  
 5. Fragment表达式: ~{...}  
 thymeleaf的布局属性,一般用于加载页面中重复使用到的片段，如页面的页头，导航栏，页脚等  
 **th:replace: 布局标签，替换整个标签到引入的文件  
 th:include: 布局标签，替换内容到引入的文件**  
 **片段:**  
 ![](http://i.imgur.com/GSuB942.png)  
 **引用:**  
 ![](http://i.imgur.com/5sAUW52.png)
- thymeleaf属性特殊用法  
 thymeleaf属性一般用于html标签体,但不能使用静态方法,如格式化时间等，可通过[[]]来实现  
![](http://i.imgur.com/jmnYeZQ.png)  
将读取的时间格式格式化为指定格式  

# 2017/9/11 星期一 下午 9:57:55  
前台交互界面和后台管理(部分功能界面)终于完成了,明天开始后台代码的编写  
![](https://i.imgur.com/VdgP8xO.png)


