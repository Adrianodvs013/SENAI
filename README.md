# SENAI
 Programa Sala de Aula
 
 
 <!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sala de Aula</title>
</head>
<body>
    <p>Meu primeiro teste!</p>
    <h3>Seria isso um programa?</h3>
    <p><strong>Não</strong> consigo fazer nada além de mostrar conteudo fico?</p>
    <p>Conheça o site da nossa Editora: <a href="https://www.casadocodigo.com.br/">Clique aqui para conferir!</a></p>

    <script>
        alert("Podemos fazer mais com JavaScript!");
    </script>

     <button onclick="resultado()"> Clique aqui!</button>
     <br>
     
    <script>  //2.1 Dê olá ao mundo de outras formas
        alert("Olá, mundo!");
        alert("Este é o meu segundo programa!");
    </script>

    <script>  //2.2 Trabalhe com números
        alert("Minha idade é:");
        alert("33 anos");
        alert("33" + "33"); //concatenação
        alert(33 + 33);    // soma
        alert("Eu nasci em:");
        alert("1989 - 12");
        alert("A soma das nossas odades é:");
        alert(28 + 30 + 33);
        alert("A média das nossas idades é:");
        alert((28 + 30 + 33) / 3);
        alertA("média das nossas idades é: + ((28 + 30 + 33) / 3)");
    </script>

    <script>//2.3 Revisando o seu código: trabalhando com números
        alert("Minha idade é:" + 33);
        alert("A soma das nossas odades é:");
        alert(28 + 30 + 33);
        alertA("média das nossas idades é: + ((28 + 30 + 33) / 3)");
    </script>
    
    <div id="demo"></div>
    
    <script>
        alert("Inicio do curso: 03/04/2013")
        var data = new Date(25/12);

        function resultado(){
            document.getElementById("deso").innerHTML = data;
        }
    </script>
         
   
</body>
</html>

