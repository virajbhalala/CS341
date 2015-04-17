# URL-Checker-based-on-DFA(Deterministic Pushdown Automata)

let @= {a, b, c, . . . , z}

let E=@ ∪ {.} where E(epsilon) means the set of symbols that can only be used

 S1 = {www.}

 S2 = @@∗, which consists of strings over 􀀀 of positive length

 S3 = {.com} ∪ {.co.jp}



 L1 = S1 S2 S3

 L2 = S2 S3

 L = L1 ∪ L2


DFA image 

![alt tag](https://github.com/virajbhalala/URL-Checker-based-on-DFA/blob/master/DFA.png)


