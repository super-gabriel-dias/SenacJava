opcao = False
numero = 1
texto = "1"
resultado = (opcao and not opcao)
numero += 2
resultado = (numero >= 2) or resultado
numero = 1
resultado = (numero == texto) and resultado
print(resultado)
