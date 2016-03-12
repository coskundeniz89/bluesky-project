'use strict';

/* App Module */

var phonecatApp = angular.module('phonecatApp', [
  'ngRoute',
  'phonecatControllers'
]);

phonecatApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/phones', {
        templateUrl: '/html/study/angularjs/test2/phone-list.html',
        controller: 'PhoneListCtrl'
      }).
      when('/phones/:phoneId', {
        templateUrl: '/html/study/angularjs/test2/phone-detail.html',
        controller: 'PhoneDetailCtrl'
      }).
      otherwise({
        redirectTo: '/phones'
      });
  }]);