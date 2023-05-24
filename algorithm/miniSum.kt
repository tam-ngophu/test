
fun main(args: Array<String>) {
    val arr = arrayOf<Int>(5, 2, 3, 4, 1)
    var tong =0
    var tong1 =0
    var i = 0
    var j =i+1
    var temp:Int = 1
    for (i in arr.indices){
        for (j in arr.indices){
            if(arr[i] < arr[j]){
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }
    for (i in arr.indices){
        print(" " +arr[i])
    }
    println(" ")
    for (i in arr.indices){
        tong = tong+arr[i]
        if(i==3){
            print(" $tong ")
        }
    }
    for (i in arr.indices){
        for (j in arr.indices){
            if(arr[i] > arr[j]){
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }

    for (i in arr.indices) {
        tong1 = tong1+arr[i]
        if (i==3) {
            println("$tong1")
        }
    }
    print("Số lượng phần tử của mảng là:")
    print("${arr.count()}")
    println()
    print("Min của mảng là: ")
    print("${arr.min()}")
    println()
    print("Max của mảng là: ")
    print("${arr.max()}")
    println()
    print("Phần tử chẵn trong mảng:")
    for (i in arr.indices step 1) {
        if(arr[i]%2==0 && arr[i]%1==0) {
            print(" " + arr[i])
        }
    }
    println()
    print("Phần tử lẻ trong mảng:")
    for (i in arr.indices step 1) {
        if(arr[i]%arr[i]==0 && arr[i]%1==0 && arr[i]%2!=0) {
            print(" " + arr[i])
        }
    }
}
