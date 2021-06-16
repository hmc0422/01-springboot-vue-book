<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>图书列表</title>
</head>
<body>

<table border="1">
    <tr>
        <td>编号</td>
        <td>名称</td>
        <td>作者</td>
    </tr>
    <#if books ??&&(books?size>0)>
        <#list books as book>
            <tr>
                <td>${book.id}</td>
                <td>${book.name}</td>
                <td>${book.author}</td>
            </tr>
        </#list>
    </#if>
</table>

</body>
</html>