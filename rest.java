@RequestMapping(value = "/postValue", method = RequestMethod.POST)
	public  ResponseEntity<List<EmployeeEntity> > postemployees(@RequestParam(value="firstname1")String firstname1) throws JsonProcessingException{
		
		System.out.println("GOOD");
		mapper= new ObjectMapper();
		employeeManager.addEmployee(v);
