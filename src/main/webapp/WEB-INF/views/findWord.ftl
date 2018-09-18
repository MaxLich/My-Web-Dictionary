<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Поиск слова в словаре</title>
</head>
<body>
<h1>Поиск слова в словаре</h1>
<form name="record" action="/my-web-dictionary/dictionary-find-word/" method="post" accept-charset="UTF-8">
    Слово: <input title="Слово" type="text" name="word" value="<#if record??>${record.word}</#if>"><input type="submit" value="Найти">
</form>

<!-- вывод слова и его значения -->
<#if record??>
<p><u>${record.word}</u> - ${record.definition}</p>
</#if>

<!-- вывод сообщения, если слово не найдено -->
<#if error??>
<p>${error}</p>
</#if>

<br>
<a href="/my-web-dictionary/">Back</a>

</body>
</html>