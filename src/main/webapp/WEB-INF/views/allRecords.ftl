<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Содержимое словаря</title>
</head>
<body>

<h1>Все слова из словаря:</h1>

<ul>
<#list recordList as record>
    <li><u>${record.word}</u> - ${record.definition}</li>
</#list>
</ul>
<br>
<a href="/my-web-dictionary/">Back</a>

</body>
</html>