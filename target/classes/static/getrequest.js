GET: $(document).ready(
	function() {

		// GET REQUEST
		$("#getDeputado").click(function(event) {
			event.preventDefault();
			ajaxGet();
		});

		// DO GET
		function ajaxGet() {
			$.ajax({
				type: "GET",
				url: "deputados/204521",
				success: function(result) {

					//						if (result.status == "success") {
					$('#getResultDiv ul').empty();
					var custList = "";
					$.each(result.data,
						function(i, deputado) {
							var user = "Nome  "
								+ deputado.nomeCivil
								+ "<br>";
							$('#getResultDiv .list-group').append(
								user)
						});
					console.log("Success: ", result);
					//						} else {
					//							$("#getResultDiv").html("<strong>Error</strong>");
					//							console.log("Fail: ", result);
					//						}
				},
				error: function(e) {
					$("#getResultDiv").html("<strong>Error</strong>");
					console.log("ERROR: ", e);
				}
			});
		}
	})

//recebe os dados de um parlamentar
$(document).ready(function() {
	$.ajax({
		url: "deputados/204521"
	}).then(function(data) {
		var Deputado = "Nome: " + data.dados.nomeCivil + "<br>" +
			"Data de nascimento: " + data.dados.dataNascimento + "<br>" +
			"Sexo: " + data.dados.sexo + "<br>" +
			"Partido: " + data.dados.ultimoStatus.siglaPartido + "<br>";
		$('#getResultDiv .list-group').append(Deputado);
	});
});