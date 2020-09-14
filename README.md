### 需求
You are given strings of different lengths.
 
If the number of vowels (aeiou) are more than 30% of the string length 
then insert ‘mommy’ for each continuous set of vowels.

### 要求
- 使用TDD方式实现上述需求，注意TDD Cycle（红-绿-重构）
- YAGNI
- 小步提交
- TIPS：注意测试用例的完整性

###Task
> * 1.Given the null string  
   When  isNull  
   Then throw new Exception("string is null")

> * 2.Given ""  
   When  get length  
   Then return itself
   
> * 3.Given the number of vowels (aeiou) are not more than 30% of the string length  
   When get length  
   Then return itself
   
> * 4.Given the number of vowels (aeiou) are more than 30% of the string length
   	and string is not include continuous set of vowels  
   When get length  
   Then return  itself
   
>* 5.Given the number of vowels (aeiou) are more than 30% of the string length
   	and string include continuous set of vowels  
   When get length  
   Then return  string of insert ‘mommy’ for each continuous set of vowels