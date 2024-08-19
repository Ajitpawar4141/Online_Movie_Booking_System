import AdminDropdown from "./Dropdown" 

const styles = {  
headerlogo: {
    width: '50px',
    height: '30px',
    margin: '5px'
    }

}

const Header = () => {
    return(
       <div>
                <nav class="navbar navbar-light bg-light">
                    <h2 class="navbar-brand" href="#">
                    <h2  /*style={styles.headerlogo}*/ class="d-inline-block align-top" alt="">
                    FilmTicket</h2>
                    </h2>
                
                <div className="row">
                <div className="col"></div> 
                <div className="col"></div> 
                <div className="col"></div>
                <div className="col"></div>
                <div className="col"></div>
                <div className="col">
                <AdminDropdown/>
                </div>
                </div>
                </nav>
       </div>

    )
}


export default Header