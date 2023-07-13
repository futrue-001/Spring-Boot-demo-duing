<html >
    <head>
        <meta charset="UTF-8">
        <title>FreeMarker模板使用</title>
    </head>
    <body>
        <h1>这是FreeMaker模板</h1>
        <h2>FreeMaker取值写法如下: </h2>
        <p>Hello FreeMaker current time : ${now}</p>
        <p>${"Hello FreeMaker current time :"+ now }</p>
        <p>${"Hello FreeMaker current time : ${now}"}</p>
    </body>
</html>
