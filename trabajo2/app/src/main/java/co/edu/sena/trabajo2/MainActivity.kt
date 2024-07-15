package co.edu.sena.trabajo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import co.edu.sena.trabajo2.ui.theme.Trabajo2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Trabajo2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Valiables. \n" +
                                "Se utiliza la palabra clave (var).\n" +
                                "Puede modificarse.\n\n"+
                                "var edad: Int = 30\n" +
                                "edad = 31 \n\n\n\n" +
                                "Constantes\n" +
                                "Se utiliza la palabra clave (val).\n" +
                                "No se puede modificar \n\n"+
                                "val nombre: String = \"Juan\" \n\n\n\n" +
                                "Opcionales\n" +
                                "Son variables vacías (null) o que pueden tener un valor. \n" +
                                "Se declaran con el operador (?).\n\n" +
                                "var edad: Int? = null \n\n\n\n" +
                                " Nulos\n" +
                                "Se utiliza el sistema de tipos (Tipo?) para evitar errores de referencia nula. \n\n" +
                                "var nombre: String? = \"Juan\"\n" +
                                "var edad: Int? = null \n\n\n\n" +
                                "README.md \n"+
                                "El archivo README.md es una convención ampliamente utilizada en muchos proyectos de software \n" +
                                "incluidos los escritos en Kotlin. \n " +
                                "Se utiliza principalmente para proporcionar documentación y orientación sobre el proyecto a desarrolladore",

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "$name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Trabajo2Theme {
        Greeting("Android")
    }
}