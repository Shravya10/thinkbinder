var app = angular.module('createuserapp', []);
app.controller('createusercontroller', function($scope, $http, $location) {
	$scope.submitForm = function() {
		var url = $location.absUrl() + "postcustomer";

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}
		var data = {
			firstname : $scope.firstname,
			lastname : $scope.lastname,
			contactno : $scope.contactno,
			email : $scope.email,
			dob : $scope.dob,
			technology : $scope.technology
		};

		$http.post(url, data, config).then(function(response) {
			console.log(data);
			$scope.postResultMessage = "Sucessful!";
		}, function(response) {
			$scope.postResultMessage = "Fail!";
		});
		
		$scope.firstname = "";
		$scope.lastname = "";
		$scope.contactno = "";
		$scope.email = "";
		$scope.dob = "";
		$scope.technology = "";

	}
});
