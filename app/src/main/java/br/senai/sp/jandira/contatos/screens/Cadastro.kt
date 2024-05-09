package br.senai.sp.jandira.contatos.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaCadastro() {
    Scaffold(topBar = {
        TopAppBar(
            title = {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack, contentDescription = "Voltar"
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = "Novo contato")
                }
            }, colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFFE91E63), titleContentColor = Color.White
            )
        )
    }, content = {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(24.dp)
            ) {
                Box(
                    modifier = Modifier.size(width = 150.dp, height = 150.dp),
                    contentAlignment = Alignment.BottomEnd
                ) {
                    Card(
                        modifier = Modifier.fillMaxSize(), shape = CircleShape
                    ) {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            shape = CircleShape,
                            border = BorderStroke(width = 1.dp, color = Color.LightGray)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "Pessoa",
                                tint = Color.LightGray
                            )
                        }
                    }
                    Card(
                        modifier = Modifier.size(width = 60.dp, height = 60.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFE91E63))
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.PhotoCamera,
                                contentDescription = "Foto",
                                tint = Color.White
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(32.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    label = {
                        Text(text = "Nome do meu contato")
                    },
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Pessoa",
                            tint = Color(0xFFE91E63)
                        )
                    }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    label = {
                        Text(text = "E-mail do meu contato")
                    },
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "Pessoa",
                            tint = Color(0xFFE91E63)
                        )
                    }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    label = {
                        Text(text = "Telefone do meu contato")
                    },
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.PhoneAndroid,
                            contentDescription = "Pessoa",
                            tint = Color(0xFFE91E63)
                        )
                    }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    label = {
                        Text(text = "Data de nascimento do meu contato")
                    },
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.CalendarMonth,
                            contentDescription = "Pessoa",
                            tint = Color(0xFFE91E63)
                        )
                    }
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Checkbox(checked = false, onCheckedChange = {})
                    Text(
                        text = "Amigo"
                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(64.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults
                        .buttonColors(
                            containerColor = Color(0xFFE91E63)
                        )
                ) {
                    Text(
                        text = "Gravar contato", fontSize = 20.sp
                    )
                }
            }
        }
    })
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaCadastroPreview() {
    TelaCadastro()
}