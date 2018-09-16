<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Выбор слова для изменения его значения</title>
</head>
<body>

<h1>Выберете слово, значение которого надо изменить:</h1>

<ul>
    <#list recordList as record>
        <li><a href="/my-web-dictionary/dictionary-change-definition-of-word/${record.id}">${record.word}</a></li>
    </#list>
</ul>

<br>
<a href="/my-web-dictionary/">Back</a>
</body>
</html>