<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Поиск слова в словаре по его значению</title>
</head>
<body>
<h1>Поиск слова в словаре по его значению</h1>
<form name="record" action="/my-web-dictionary/dictionary-find-word-by-definition/" method="post" accept-charset="UTF-8">
    Значение:<br>
    <textarea title="Значение слова" rows="10" cols="50" name="definition"><#if inputDef??>${inputDef}</#if></textarea><br>
    <input type="submit" value="Найти">
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