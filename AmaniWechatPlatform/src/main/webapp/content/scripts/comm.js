// JavaScript Document
var BOSH_SERVICE = '/xmpp-httpbind';
var connection = null;

function notifyUser(msg){
	if (msg.getAttribute('to').toLowerCase() == userLocalhost.toLowerCase() ) {
		var elems = msg.getElementsByTagName('body');
		var body = elems[0];
		$('#notifications').prepend(Strophe.getText(body));
	}
	return true;
}

function onConnect(status){
	if (status == Strophe.Status.CONNECTED) {
		connection.addHandler(notifyUser, null, 'message', null, null,  null);
		connection.send($pres().tree());
	}
}