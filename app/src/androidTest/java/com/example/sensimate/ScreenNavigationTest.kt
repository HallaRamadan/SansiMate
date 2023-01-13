import androidx.activity.ComponentActivity
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.example.sensimate.BottomNavGraph
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class ScreenNavigationTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private lateinit var navController: TestNavHostController

    @Before
    fun setupBottomNavGraphNavHost(){
        composeTestRule.setContent{
            navController=TestNavHostController(LocalContext.current).apply{
                navigatorProvider.addNavigator(ComposeNavigator())
            }
            // BottomNavGraph(navController = navController)
        }
    }
    @Test
    fun BottomBarScreen_verifyStartDestination(){
       // navController.
    }




}