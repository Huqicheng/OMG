
exports.routes = function(app){
	app.use("/user", require("./user.js"));
	// app.use("/content", require("./content.js").router);
}
