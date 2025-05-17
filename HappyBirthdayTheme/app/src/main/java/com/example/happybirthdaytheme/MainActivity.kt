@Composable
fun BusinessCard(name: String, title: String, phone: String, email: String) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = name, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = title, fontSize = 20.sp)
        Text(text = phone, fontSize = 16.sp)
        Text(text = email, fontSize = 16.sp)
    }
}
