package Dropdown;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {
    @Test
    public  void testSelectOption(){
         var dropDownPage= homePage.clickDropDownPage();
         String option = "Option 1";
         dropDownPage.selectFromDropDown("Option 1");
         var selectedOptions= dropDownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(),1, "The selection option isn't the expected");
        Assert.assertTrue(selectedOptions.contains(option), "Option no selected");


    }
}
