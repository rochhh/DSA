def countBits( n):
        bits = [0] * (n + 1) # initialize bits array with zeros
        for i in range(1, n + 1):
            bits[i] = bits[i >> 1] + (i & 1)
            print(bits[i])
        return bits

print( countBits(5) )