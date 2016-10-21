In this project, I will keep adding framework which will be helpful from developer perspective

JUNIT
Folowing keywords are used
  1. assetsEqual(Object expected, Object condition) - This method checks whether expected is equal to condition.
  2. assetsTrue(String message, boolean condition) - Checks whether condition is true, if not then it sends Message in the console
  3. assetsFalse - similar tp aseetsTrue
  
  Some Annotation
  @Test - to be added above method to make framework understands that the method needs to be tested
  @Before - called before every methods
  @After - called after every methods
  @BeforeClass - called before the class is created
  @AfterClass - called before the class is getting destroyed
  
  All the methods does need to have public void in their methods
  @BeforeClass and AfterClass - also needs to have static field
  
  @Test(exception.class) - this is called to check whether exception is generated
  @Test(timeout = <millesecond>)  - this can be used for checking the performance
  
---------------
  
