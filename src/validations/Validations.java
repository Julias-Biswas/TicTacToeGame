/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author julia
 */
public class Validations 
{
    private Pattern user1 ;
    private Pattern user2 ;
    
    private Matcher matcher ;
    private static final String NAME_PATTERN = "^[A-Za-z-0-9 ]{3,25}$";
    
    
    public Validations()
    {
        user1 = Pattern.compile(NAME_PATTERN);
        user2 = Pattern.compile(NAME_PATTERN);
    }
    
    public boolean nameValidate1(final String name1)
    {
        matcher = user1.matcher(name1);
        return matcher.matches();
    }
    
    public boolean nameValidate2(final String name2)
    {
        matcher = user2.matcher(name2);
        return matcher.matches();
    }
}
