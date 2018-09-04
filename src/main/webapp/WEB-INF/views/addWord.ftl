<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Добавление нового слова</title>
</head>
<body>

<h1>Добавление нового слова</h1>
<form name="record" action="/my-web-dictionary/dictionary-add-word/" method="post" accept-charset="UTF-8">
    Слово:<br>
    <input title="Слово" type="text" name="word" style="width: 418px;"><br>
    Значение:<br>
    <textarea title="Значение слова" rows="10" cols="50" name="definition"></textarea><br>
    <input type="submit" value="OK">
</form>

<br>
<a href="/my-web-dictionary/">Back</a>

</body>
</html>