#algoritmo busca em profundidade - Explora todos os vértices alcançáveis a partir de um vértice inicial, indo o mais longe possível por cada caminho antes de voltar e tentar outros caminhos.

grafo = {
"A": ["B", "C", "D"],
"B": ["A"],
"C": ["A"],
"D": ["G", "E"],
"E": ["D"],
"F": ["H", "I"],
"G": ["D"],
"H": ["F"],
"I": ["F"]
}

visitados = {}
subgrafo = []


def profundidade(v_atual, v_procurado, visitados, subgrafo, grafo):
    
    if v_atual == v_procurado:
        visitados.add(v_atual)
        subgrafo.append(v_atual)
        return True

    visitados.add(v_atual)
    subgrafo.append(v_atual)

    for v in range (grafo[f"{v_atual}"]):

        if v in visitados:
            subgrafo.pop()
            return False
        

        v_atual = v
        encontrado = profundidade(v_atual, v_procurado, visitados, subgrafo)

    
    

    

    





        
        
      
    






  
    '''if vertice not in visitados:
        visitados.add(vertice)
        grafo.append(vertice)
       
       #como escolher um elemento?
       if (f"{dic(vertice):0}" == grafo[-1]):
          grafo.pop
          return dic(vertice):0
        def profundidade ([dic(vertice):0]) #mudar


    
































'''grafo1 = {} #é um dicionário

grafo = []

V = input("Informe o vértice raíz")
grafo.push(v)

grafo1 = {v:1} #a cada iteração para cada vértce adciona

adj = dic[v]
#for elemento in adj 

#Quem já foi visitado, para não cair em ciclos infinitos. Qual é o próximo vértice a visitar, ou seja, usar uma pilha para controlar essa ordem.

grafo = {}
grafo.append(v)

dic(chave v pegue um)

grafo = [v]

dic(chave v pegue um)

if dic( elemento chave v pegue um) já estiver na lista volta, o v  vai ser o antigo (guardar ele e o anterior?)







































def dfs(raiz):
    this.raiz = (f"{raiz}")

#escolher de onde vai partir (v)

#escolher como qual seá o nó que terá que ser encontrado (e)

#se no v = e break, se não pegue os valores de v, v = valor de v ()um dos,. se v = e break, se não pegue os valores e repita o processo (recursivo )

''' i =+1 
    if v == e and i == 0 :
       break
    else
        lista = dic [v] pega os valores de v como uma lista
            if lista[i] = e:
               break
            else:
            lista = dic[lista[i]]

'''
'''
   Se a chave for igual a chave do vértice que estamos procurando - sucesso.

   Se não, pegue a lista dos valores que a chave tem, e adcione o f em um conjunto
        Se a chave for igual a chave do vértice que estamos procurando - sucesso (é adjacente a chave anterior)
         
        Se não,  pegue a lista dos valores que a chave tem, e adcione o f(h) em um conjunto. caso 
        

'''