# 1 - Quantidade de vértices = quantidade de linhas e colunas

a = int(input("Digite a quantidade de vértices do grafo 1:"))

# 2 - Criar a matriz 1

matriz = []

for i in range(a):  # Para cada linha
    linha = [0] * a  # Cria uma linha com 'a' zeros
    matriz.append(linha)

#matriz = [[0] * a for linha in range(a)] (outro jeito de criar)

# 3 - Ver as adjacências da matriz 1
for linha in range(a):
    for coluna in range(a):
        matriz[linha,coluna] = int(input(f"Digite '1' se há adjacência na posição [{linha},{coluna}]: "))

        #Caso não digite 0 ou 1
        while matriz[linha,coluna] != 1 and matriz[linha,coluna] != 0:
            matriz[linha,coluna] = int((input(f"Digite '1' se há adjacência na posição [{linha},{coluna}]: ")))


# 4 - Quantidade de vértices = quantidade de linhas e colunas
b = int(input("Digite a quantidade de vértices do grafo 2 :"))

# 5 - Criar a matriz 2
matriz2= []

for i in range(b):  # Para cada linha
    linha = [0] * b  # Cria uma linha com 'a' zeros
    matriz2.append(linha)

# 6 - Verificar se o número de vértices são iguais 
if b != a:
    print("Os grafos não são isomorfos")
else:
    for linha in range(b):
        for coluna in range(b):
            matriz2[linha,coluna] = int(input(f"Digite '1' se há adjacência na posição [{linha},{coluna}]: "))

            while matriz2[linha,coluna] != 1 and matriz[linha,coluna] != 0:
                matriz2[linha,coluna] = int(input(f"Digite '1' se há adjacência na posição [{linha},{coluna}]:"))

            #7 - Caso não exista igualdade de adjacência nas mesmas coordenadas, não são isomorfos
            if matriz2[linha,coluna] != matriz[linha,coluna]:
                print("Os grafos não são isomorfos")
                iso = False
                break
if iso != False:
    print("Os grafos são isomorfos")

