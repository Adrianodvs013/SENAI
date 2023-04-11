<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=h3, initial-scale=1.0">
    <title></title>
</head>
<body>
    <h3>Média de Idade</h3>
    <p>Calcule a media das tres pessoas:<br>
       Eu, Adriano e Paulo.</p>
        

    <script>
        //Aqui eu crio as variaveis.
        var pulaLinha = function(){
          document.write("<br>")
        }
        
        var eu = 25
        var adriano = 26
        var paulo = 32

        var total = (eu + adriano + paulo)
        var media = (total / 3)

        document.write("A média de idade é: " + media)
        
    </script>
</body>

<footer><strong> Feito por Adriano Gomes</strong></footer>
</html>
