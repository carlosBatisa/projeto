<!DOCTYPE HTML>
<html lang="pt-br">
<head>

<title>Cadastrar</title>
<link rel="stylesheet" href="css/bootstrap.css">
<script type="text/javascript" src="js/bootstrap.js"></script>

<style>
	.well{
	background: #358CCE;
	color: #fff;
	border-radius: 0px;
	}
</style>
	<!--[if lt IE 9]> 
		<script scr="//http://html5shim.googlecode.com/svn/trunk/html5"
	-->
</head>

<body>
<div class="well">
<div class="container">
		<h3>Projeto Heranca</h3>
</div>
</div>
	<div class="container">
		<div id="cadastro1" style="margin-top:50px;"
		class="mainbox col-md-6 col-md-offset-3 col-sm-offset">
		<div class="panel panel-primary">
		
		<div class="panel-heading">
			<h2 class="panel-title"> Cadastro</h2>
		</div>

<div class="panel-body">
<form method="post" action="Controle?cmd=gravar">

<div class="form-group">
<label for="codigo">Codigo</label>
	
	<input type="number" name="codigo" value="" size="5"
			placeholder="entre com o codigo"
			title="Codigo em numero"
			required="required"
			class="form-control"
			/>
	</div>
	<div class="form-group">	
	<label for="nome">Nome</label>
	<input type="text" name="nome" value="" size="50"
			placeholder="entre com o nome"
			title="Nome em Letras"
			required="required"
			pattern="[A-Z a-z]{3,35}"
			class="form-control"
			/>
	</div>		
	<div class="form-group">		
	<label for="email">Email</label>
	<input type="email" name="email" value="" size="50"
			placeholder="entre com o Email"
			title="Email Padrao"
			required="required"
			class="form-control"
			
			/>
	</div>	
	<div class="form-group">
	<label for="salario">Salario</label>
	<input type="text" name="salario" value="" size="10"
			placeholder="entre com o salario"
			title="Salario no padrao"
			required="required"
			class="form-control"
			/>
	</div>
		<div class="form-group">
			<label for="escolha">Escolha</label>
	     <select name="tipo" required="required">
		<option>Escolha um tipo</option>
		<option value="funcionarioclt">Funcionario Clt</option>
		<option value="funcionario">Funcionario</option>
		
	</select>
	</div>
	
<input type="submit" value="Enviar" class="btn btn-primary"/>

</form>
</div>
	</div>
	</div>
	</div>
</body>
</html>