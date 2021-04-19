//recebe os dados de todos os parlamentares
$(document).ready(function() {
	$.ajax({
		url: "deputados"
	}).then(function(data) {

		for (i = 0; i < data.dados.length; i++) {
			var deputados = "Nome: " + data.dados[i].nome +
				" Partido: " + data.dados[i].siglaPartido +
				" Estado: " + data.dados[i].siglaUf;
				$('#getResultDiv .list-group').append("<ul><li>" + deputados + "</li></ul>");
		}
		var proximo = data.links[1].href;
		$("a").attr("href", proximo);
	});
});





//$(document).ready(function() {
//    $.ajax({
//        url: "deputados"
//    }).then(function(data) {
//        
//        var deputado_data = '';
//		$.each(data, function(key, value){
//			deputado_data +='<tr>';
//			deputado_data +='<td>'+value.dados.nome+'<td>';
//			deputado_data +='<td>'+value.dados.siglaPartido+'<td>'
//			deputado_data +='<td>'+value.dados.siglaUf+'<td>'
//			deputado_data +='<td>'+value.dados.id+'<td>'
//			deputado_data +='</tr>';
//		});
//        $('deputado-table').append(deputado_data)
//    });
//});