

function EntradaController() {
	alert('Ei... pegou!!!');
}

(function() {
	var app = angular.module("financ", []);
	
	app.controller('PanelController', function() {
		this.tab = 1;
		
		this.selectTab = function(setTab) {
			this.tab = setTab;
		};
		
		this.isSelectedTab = function(checkTab) {
			return this.tab === checkTab;
		};
	});
	
	
	app.controller('FinancController', function() {
		this.saidas = gem;
	});
	
	var gem = [{
		data:"02/09/2015",
		descricao: "Paes",
		recebedor: "Padaria X",
		tipo: "Alimentacao",
		preco: 20.89,
		pagamento: "a vista",
		divido_em: 1,
		realizado: true,
	}, 
	{
		data:"03/09/2015",
		descricao: "Combustível",
		recebedor: "Posto Y",
		tipo: "Transporte",
		preco: 120.89,
		pagamento: "Cartao Visa",
		divido_em: 2,
		realizado: true,
	},{
		data:"15/10/2015",
		descricao: "Paes",
		recebedor: "Padaria Z",
		tipo: "Alimentacao",
		preco: 10.89,
		pagamento: "a vista",
		divido_em: 1,
		realizado: false,
	},{
		data:"30/08/2015",
		descricao: "Estacionamento Shopping",
		recebedor: "Shopping M",
		tipo: "Transporte",
		preco: 5.00,
		pagamento: "a vista",
		divido_em: 1,
		realizado: true,
	}	
	]
})();
