<!DOCTYPE html>
<html lang="zh-cn" xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="../static/bootstrap/css/bootstrap.css"
          th:href="@{/bootstrap/css/bootstrap.css}"/>
    <link rel="stylesheet" type="text/css" href="../static/bootstrap/css/bootstrap-grid.css"
          th:href="@{/bootstrap/css/bootstrap-grid.css}"/>
    <link rel="stylesheet" type="text/css" href="../static/bootstrap/css/bootstrap-reboot.css"
          th:href="@{/bootstrap/css/bootstrap-reboot.css}"/>
</head>
<body>
<div id="App">
    <div class="container">
        <div class="card">
            <div class="card-body">
                <h3 class="card-title">
                    欢迎登陆
                </h3>
                <form id="loginForm" @submit.prevent="login">
                    <div class="form-group">
                        <label for="loginName">用户名</label>
                        <input class="form-control" type="text" required id="loginName" v-model="user.loginName"
                               name="loginName">
                    </div>
                    <div class="form-group">
                        <label for="password">密码</label>
                        <input class="form-control" type="password" required id="password" v-model="user.password"
                               name="password">
                    </div>
                    <div class="form-group">
                        <button class="btn btn-link" type="submit">登录</button>
                        <button class="btn btn-link" type="button" onclick="window.location.href='/registration'">注册
                        </button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
<script src="../static/js/jquery.js" th:src="@{/js/jquery.js}"></script>
<script src="../static/js/vue.js" th:src="@{/js/vue.js}"></script>
<script src="../static/js/vue-resource.js" th:src="@{/js/vue-resource.js}"></script>
<script src="../static/bootstrap/js/bootstrap.js" th:src="@{/bootstrap/js/bootstrap.js}"></script>
<script src="../static/bootstrap/js/bootstrap.bundle.js" th:src="@{/bootstrap/js/bootstrap.bundle.js}"></script>
<script src="../static/js/common.js" th:src="@{/js/common.js}"></script>


<script type="module">
    var vm = new Vue({
        el: "#App",
        data: {
            loginName: "",
            password: ""
        },
        methods: {
            login() {
                $.ajax({
                    method:"post",
                    url:"/userService/signIn",
                    contentType:"application/json",
                    dataType:"json",
                    async:true,
                    success(json){
                        if(json["retCode"]==="000"){

                        }
                    },
                    error(){

                    }
                })
            }
        }
    });
</script>
</html>