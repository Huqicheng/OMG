var request = require("request");
var router = require("express").Router();
var formidable = require("formidable");
var response_result = require("../models/response_result.js");
var constants = require("../configurations/constants.js");
var middlewares = require("../middlewares")
var settings = requeire("../configurations/setting.js")


// https://segmentfault.com/a/1190000000385867
router.post("/login", middlewares.body_parser.parse_form,function(req,res,next){

    let username = req.query.fields.username;
    let password = req.query.fields.password;

    request.post({
        url:settings["http_request_base_url"] + "login",
        form: {
            username:username,
            password:password
        }},
        function(err,httpResponse,body)
        {
            if(!err && httpResponse.statusCode == 200) {
                // do something
            } else {

            }
        });

});


module.exports = router;