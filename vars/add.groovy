def call(result){
   string defaultValue: '10', description: 'Enter number one', name: 'varOne'
   string defaultValue: '20', description: 'Enter number two', name: 'varTwo'
   def varOne = params.varOne as int
   def varTwo = params.varTwo as int
   def result = varOne + varTwo
   echo "Result is ${result}"
}
