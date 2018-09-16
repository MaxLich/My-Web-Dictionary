<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Изменение значения слова</title>
</head>
<body>

<h1>Изменение значения слова</h1>
<form name="record" action="/my-web-dictionary/dictionary-change-definition-of-word" method="post" accept-charset="UTF-8">
    Слово:<br>
    <input title="Слово" type="text" name="word" style="width: 418px;" readonly value="${record.word}"><br>
    Значение:<br>
    <textarea title="Значение слова" rows="10" cols="50" name="definition">${record.definition}</textarea><br>
    <input type="submit" value="Изменить">
</form>

<br>
<a href="/my-web-dictionary/dictionary-change-definition-of-word">Back</a>

</body>
</html>