<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Выбор слова, которое надо удалить</title>
</head>
<body>

<h1>Выберете слово, которое надо удалить из словаря:</h1>

<ul>
    <#list recordList as record>
        <li><a href="/my-web-dictionary/dictionary-delete-word/${record.id}">${record.word}</a></li>
    </#list>
</ul>

<br>
<a href="/my-web-dictionary/">Back</a>
</body>
</html>