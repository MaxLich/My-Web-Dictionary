<html>
<head>
<meta charset="UTF-8">
    <title>Словарь</title></head>
<body>
<h1><span lang="ru">Словарь</span></h1>

<#if message??>
<p>${message.text}</p>
</#if>
<#--show message here-->
<h4><span lang="ru">Выберете действие:</span></h4>
<ol>
    <li><a href="/my-web-dictionary/dictionary-add-word">Добавить слово в словарь</a></li>
    <li><a href="/my-web-dictionary/dictionary-find-word">Найти слово в словаре</a></li>
    <li><a href="/my-web-dictionary/dictionary-find-word-by-definition">Найти слово в словаре по значению</a></li>
    <li><a href="/my-web-dictionary/dictionary-change-definition-of-word">Изменить значение слова из словаря</a></li>
    <li><a href="/my-web-dictionary/dictionary-delete-word">Удалить слово из словаря</a></li>
    <li><a href="/my-web-dictionary/dictionary-all-records">Отобразить все слова из словаря</a></li>
</ol>

</body>
</html>