/*
  The RSA Encryption Algorithm
 Public key : (E, N)
 Private key : (D, N)
 Key pair : (E, D, N)
 Encryption : Encrypted = (Origin)^E mod N
 Decryption : Origin = (Encrypted)^D mod N
*/

/* least common multiplier */
fun lcm(a : Int, b : Int) : Int {
  val c = a < b ? b : a
  while ( c > 1) {
    if (a % c == 0 && b % c == 0) {
      c--
    } else {
      break
    }
  }
  return c
}


fun gcd(a : Int, b : Int) {
  val c = a < b ? a : b
  val i = 1
  while (i <  c) {
    if (a % i == 0 && b % i = 0) {
      return i
    }
  }
  return 1
}

/* first step : calculate N as the product of two prime number 'q' and 'p'*/
fun N(q : Int, p : Int) : Int{
  return q * p
}

/* second step : calculate L as the lcm of 'q - 1' and 'p - 1 */
fun L(q : Int, p : Int) : Int {
  return lcm(q - 1, p - 1)
}

fun E() : Int {
  val e = 2
  while (e < L(
}
fun main(args : Array<String>) {
        
}