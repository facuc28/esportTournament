function updateInfo() {
    $.get( "/summoner/get/medium?summonerName=" + $( "#summoner-name-input" ).placeholder)
        .done(updateSummonerInfo)
    	.fail(function () {
			alert("No podemos actualizar informacion inexistente! Busca un invocador primero.");
    });
}

function loginLogoutButton() {
	if (session == null) {	
	document.getElementById("login_btn").value = "Login"
	} else {
		document.getElementById("login_btn").value = "Salir"
	}
}

function getSummonerInfo() {
    $.get( "/summoner/get/medium?summonerName=" + $( "#search-summoner-input" ).val())
        .done(updateSummonerInfo);
}

function updateSummonerInfo(data) {
	$( "#summoner-name-input" ).html(data.data.basicSummonerInfo.name);
	$( "#summoner-ranking-input" ).html(data.data.leaguePosition.tier + ' ' + data.data.leaguePosition.rank);
	$( "#summoner-wins-input" ).html(data.data.leaguePosition.wins);
	$( "#summoner-lpoints-input" ).html(data.data.leaguePosition.leaguePoints);
	$( "#summoner-loss-input" ).html(data.data.leaguePosition.losses);
	$( "#summoner-nivel-input" ).html(data.data.basicSummonerInfo.summonerLevel);
}

function updateCurrentMatchInformation() {
	$.get( "/summoner/get/match/current?summonerName=" + $( "#search-summoner-match-input" ).val())
        .done(fillCurrentGameTableInformation)
        .fail(function () {
            alert("Error al buscar partida!");
        });
}

function fillCurrentGameTableInformation(data) {
	data.participants.forEach(function (element) {
		$( "#td-1" ).html(element.summonerName);
	});
}
