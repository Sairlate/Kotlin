class BugCivilian(rank : Int, name : String) : Bug(rank, name) {
    override fun getSugarLimit(): Int {
        return rank / 2
    }
}