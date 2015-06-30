var Watch = function() {};
Watch.prototype.start = function(successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "WatchPlugin", "start", []);
};
Watch.prototype.stop = function(successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "WatchPlugin", "stop", []);
};
Watch.prototype.nextPage = function(successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "WatchPlugin", "nextPage", []);
};
Watch.prototype.prevpage = function(successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "WatchPlugin", "prevpage", []);
};
var WatchObj = new Watch();
module.exports = WatchObj;
