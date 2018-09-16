<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Удаление слова</title>
</head>
<body>

<h1>Удаление слова</h1>
<form name="record" action="/my-web-dictionary/dictionary-delete-word" method="post" accept-charset="UTF-8">
    Слово:<br>
    <input title="Слово" type="text" name="word" style="width: 418px;" readonly value="${record.word}"><br>
    Значение:<br>
    <textarea title="Значение слова" rows="10" cols="50" name="definition" readonly>${record.definition}</textarea><br>
    <input type="submit" value="Удалить">
</form>

<br>
<a href="/my-web-dictionary/dictionary-delete-word">Back</a>

</body>
</html>