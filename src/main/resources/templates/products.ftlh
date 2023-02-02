<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Online market</title>
</head>
<body>
<h1>Free market</h1>
<hr>
<h4>All available products</h4>
<#list products as product>
<div>
    <p><b>${product.title}</b> ${product.price} EUR | <a href="/product/${product.id}">Details...</a></p>
</div>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
    Название объявления: <input type="text" name="title"/><br><br>
    Описание объявления: <input type="text" name="description"/><br><br>
    Цена: <input type="number" name="price"/><br><br>
    Город: <input type="text" name="city"/><br><br>
    Имя: <input type="text" name="author"/><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>