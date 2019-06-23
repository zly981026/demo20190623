<!DOCTYPE html>
<html lang="zh-cn" xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
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
                    完善注册信息
                </h3>
                <form>
                    <div class="form-group">
                        <label for="realName">真实姓名</label>
                        <input class="form-control" type="text" required id="realName" name="realName">
                    </div>
                    <div class="form-group">
                        <label for="loginName">用户名</label>
                        <input class="form-control" type="text" required id="loginName" name="loginName">
                    </div>
                    <div class="form-group">
                        <label for="password">密码</label>
                        <input class="form-control" type="password" required id="password" name="password">
                    </div>
                    <div class="form-group">
                        <label for="confirmPassword">确认密码</label>
                        <input class="form-control" type="password" required id="confirmPassword">
                    </div>
                    <div class="form-group">
                        <button class="btn btn-link">提交</button>
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
        data: {},
        methods: {}
    });
</script>
</html>